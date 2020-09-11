#!/usr/bin/env groovy

def hello(){
    echo "Hello, world from hello()"
}

def call(String name = 'human') {
  echo "Hello, ${name}."
  hello()
}

