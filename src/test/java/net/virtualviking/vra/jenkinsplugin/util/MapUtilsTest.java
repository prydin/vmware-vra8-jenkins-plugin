package net.virtualviking.vra.jenkinsplugin.util;

import static net.virtualviking.vra.jenkinsplugin.util.MapUtils.mapOf;
import static net.virtualviking.vra.jenkinsplugin.util.MapUtils.mappify;
import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class MapUtilsTest {
  private static final String correctJson =
      "{\"someTrue\":true,\"mapOfMaps\":{\"Foo\":{\"Bar\":\"Baz\"}},\"someFalse\":false,\"simpleMap\":{\"Foo\":\"Bar\"},\"someSet\":[\"bar\",\"foo\"],\"someString\":\"A String\",\"mapOfArrays\":{\"Foo\":[\"Bar\",\"Baz\"]},\"someInt\":42,\"someLong\":4242,\"someDouble\":42.42,\"someEnum\":\"FOO\"}";

  private static final String correctJsonArray =
      "[{\"someTrue\":true,\"mapOfMaps\":{\"Foo\":{\"Bar\":\"Baz\"}},\"someFalse\":false,\"simpleMap\":{\"Foo\":\"Bar\"},\"someSet\":[\"bar\",\"foo\"],\"someString\":\"A String\",\"mapOfArrays\":{\"Foo\":[\"Bar\",\"Baz\"]},\"someInt\":42,\"someLong\":4242,\"someDouble\":42.42,\"someEnum\":\"FOO\"}]";

  @Test
  public void testMappifyBasic() {
    final TestCase1 o = new TestCase1();
    final Map<Object, Object> map = (Map<Object, Object>) mappify(o);
    assertEquals("A String", map.get("someString"));
    assertEquals(42, map.get("someInt"));
    assertEquals(4242L, map.get("someLong"));
    assertEquals(42.42, map.get("someDouble"));
    assertEquals(true, map.get("someTrue"));
    assertEquals(false, map.get("someFalse"));
    assertEquals("FOO", map.get("someEnum"));
    assertEquals(HashSet.class, map.get("someSet").getClass());
    assertEquals(HashMap.class, map.get("simpleMap").getClass());
    assertEquals(HashMap.class, map.get("mapOfMaps").getClass());
  }

  @Test
  public void testMappifyJSON() {
    final TestCase1 o = new TestCase1();
    final Map<Object, Object> map = (Map<Object, Object>) mappify(o);
    final String json = new Gson().toJson(map);
    assertEquals(correctJson, json);
  }

  @Test
  public void testMappifyJSONArray() {
    final TestCase1[] o = new TestCase1[] {new TestCase1()};
    final List<Map<Object, Object>> array = (List<Map<Object, Object>>) mappify(o);
    final String json = new Gson().toJson(array);
    assertEquals(correctJsonArray, json);
  }

  private static enum SomeEnum {
    FOO,
    BAR,
  }

  private static class TestCase1 {
    private final Map<String, String> simpleMap = mapOf("Foo", "Bar");
    private final Map<String, Map<String, String>> mapOfMaps = mapOf("Foo", mapOf("Bar", "Baz"));
    private final Map<String, String[]> mapOfArrays = mapOf("Foo", new String[] {"Bar", "Baz"});
    private final boolean someTrue = true;
    private final boolean someFalse = false;
    private final int someInt = 42;
    private final long someLong = 4242;
    private final String someString = "A String";
    private final double someDouble = 42.42;
    private final SomeEnum someEnum = SomeEnum.FOO;
    private final Set<String> someSet = new HashSet();

    public TestCase1() {
      someSet.add("foo");
      someSet.add("bar");
    }

    public Map<String, String> getSimpleMap() {
      return simpleMap;
    }

    public Map<String, Map<String, String>> getMapOfMaps() {
      return mapOfMaps;
    }

    public Map<String, String[]> getMapOfArrays() {
      return mapOfArrays;
    }

    public boolean isSomeTrue() {
      return someTrue;
    }

    public boolean isSomeFalse() {
      return someFalse;
    }

    public int getSomeInt() {
      return someInt;
    }

    public long getSomeLong() {
      return someLong;
    }

    public String getSomeString() {
      return someString;
    }

    public double getSomeDouble() {
      return someDouble;
    }

    public SomeEnum getSomeEnum() {
      return someEnum;
    }

    public Set<String> getSomeSet() {
      return someSet;
    }
  }
}
