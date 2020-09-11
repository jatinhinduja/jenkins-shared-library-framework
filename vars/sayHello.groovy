#!/usr/bin/env groovy


import groovy.yaml.YamlSlurper
 

def hello(){
    echo "Hello, world from hello()"
    def configYaml = '''\
---
application: "Sample App"
users:
- name: "mrhaki"
  likes:
  - Groovy
  - Clojure
  - Java
- name: "Hubert"
  likes:
  - Apples
  - Bananas
connections:
- "WS1"
- "WS2"
'''
 
// Parse the YAML.
def config = new YamlSlurper().parseText(configYaml)
 
assert config.application == 'Sample App'
 
assert config.users.size() == 2
assert config.users[0] == [name: 'mrhaki', likes: ['Groovy', 'Clojure', 'Java']]
assert config.users[1] == [name: 'Hubert', likes: ['Apples', 'Bananas']]
 
assert config.connections == ['WS1', 'WS2']


}

def call(String environment = 'dev') {
  echo "Hello, ${environment}."
  hello()
}

