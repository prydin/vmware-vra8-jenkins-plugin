node {
    def dep = vraDeployFromCatalog(
            catalogItemName: 'plain-ubuntu-18',
            count: 1,
            deploymentName: 'Jenkins-#',
            projectName: 'Pontus Project',
            reason: 'Test',
            timeout: 300,
            version: '6',
            inputs: '{ username: \'testuser\' }')
    assert dep != null
    def addr = vraWaitForAddress(
            deploymentId: dep[0].id,
            resourceName: 'UbuntuMachine')
    echo "Deployed: $dep[0].id, address: $addr"
}


