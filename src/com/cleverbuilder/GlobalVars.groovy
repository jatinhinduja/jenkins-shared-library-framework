#!/usr/bin/env groovy
package com.cleverbuilder
// import groovy.yaml.YamlSlurper
@Grab(group='org.yaml', module='snakeyaml', version='1.5')
import org.yaml.snakeyaml.Yaml



// class Test implements Serializable{
//   String val
//   Test(val) {
//     this.val = val
//   }
// }


class GlobalVars implements Serializable {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo


   static def fun(){

   	return "Hello from fun-----"
   }

   static def parse_yml(environment){
   // def datas = readYaml file: "test.yml"
   
   // def datas = readYaml text: """
   
   def configYaml = """
   accounts:
    dev:
      account_id: '12312142'
      apiKey: JENK-YY92WIWSI4W6RJMZVMRAO6G2RFR
    qa:
      account_id: '12312144'
      apiKey: JENK-21L7AP9HTFJEGAQO78D8Q9WTNF5
    staging:
      account_id: '12312143'
      apiKey: JENK-OGJVRHIZKKUYWL4ESYLLE2IEYIR
    prod:
      account_id: '12312145'
      apiKey: JENK-AC966NDDCU3PALCJ3R2MRDFWICI
 """

  // assert datas.size() == 2
       // assert datas[0].something == 'my first document'
       // assert datas[1].something == 'my second document'
//modify
 // echo "${environment}"

def yaml = new Yaml()
def datas = yaml.load(configYaml)

 // def datas = new YamlSlurper().parseText(configYaml)

 if(environment=='dev'){
  return "${datas.accounts.dev}"}
 else if(environment=='qa'){
  return "${datas.accounts.qa}"}
 else if(environment=='staging'){
  return "${datas.accounts.staging}"}
 else if(environment=='prod'){
  return "${datas.accounts.prod}"}
 else{return "Please select a correct environment!!"}

}

	// def call(){

	// 	parse_yml('dev')
	// }


}