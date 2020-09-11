#!/usr/bin/env groovy

def hello(){
    echo "Hello, world from hello()"
}

def call(String environment = 'dev') {
  echo "Hello, ${environment}."
  hello()
}

