#!/usr/bin/env groovy
package com.cleverbuilder


class Test implements Serializable{
  String val
  Test(val) {
    this.val = val
    println "${this.val}"
    println "Hello World"
  }

  def func(){

    print(val)
  }


}

