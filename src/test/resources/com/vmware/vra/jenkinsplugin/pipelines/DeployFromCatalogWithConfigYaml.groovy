package com.vmware.vra.jenkinsplugin.pipelines

node {
    def config = """
"catalogItemName": "plain-ubuntu-18"
"version": "6"
"projectName": "Pontus Project"
"deploymentName": "Jenkins-#"
"inputs": 
    "username": "test"
"count": 1
"""
    def dep = vraDeployFromCatalog(
            configFormat: "yaml",
            config: config)
    assert dep != null
    def addr = vraWaitForAddress(
            deploymentId: dep[0].id,
            resourceName: 'UbuntuMachine')
    echo "Deployed: $dep[0].id, address: $addr"
    def dep2 = vraDeleteDeployment(deploymentName: dep[0].name)
    assert dep2 != null
    assert dep2.id != null
    assert dep2.id == dep[0].id
    println "Delete request ID: ${dep2}"

    def dep3 = vraGetDeployment(deploymentId: dep[0].id)
    println dep3
    assert dep3 != null
    assert dep3.id != null
    assert dep3.id == dep[0].id
    assert !dep3.status.endsWith("_INPROGRESS")
    assert dep3.deleted
}


