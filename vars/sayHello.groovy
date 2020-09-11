#!/usr/bin/env groovy

import groovy.yaml.YamlSlurper

 

def hello(){
    data = readYaml file: "test.yml"
//modify
 echo "${data.info}"


}

def call(String environment = 'dev') {
  echo "Hello, ${environment}."
  hello()
}

