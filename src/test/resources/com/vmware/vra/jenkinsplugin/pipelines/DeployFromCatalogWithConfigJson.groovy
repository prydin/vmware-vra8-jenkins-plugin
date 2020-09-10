package com.vmware.vra.jenkinsplugin.pipelines

node {
    def config = """
{
  "catalogItemName": "plain-ubuntu-18",
  "version": "6",
  "projectName": "Pontus Project",
  "deploymentName": "Jenkins-#",
  "inputs": {
    "username": "test"
   },
  "count": 1
}
"""
    def dep = vraDeployFromCatalog(
            configFormat: "json",
            config: config)
    assert dep != null
    def addr = vraWaitForAddress(
            deploymentId: dep[0].id,
            resourceName: 'UbuntuMachine')
    echo "Deployed: $dep[0].id, address: $addr"
    vraDeleteDeployment(deploymentId: dep[0].id)
}


