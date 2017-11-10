#! /usr/bin/env bash

export JBOSS_HOME=~/workspace/servers/wildfly
PROJECT_HOME=~/workspace/week2-demo1

rm -rf $PROJECT_HOME/target
rm -rf $JBOSS_HOME/standalone/tmp
rm -rf $JBOSS_HOME/standalone/data
rm -rf $JBOSS_HOME/standalone/deployments/*.failed
rm -rf $JBOSS_HOME/standalone/deployments/*.war
rm -rf $JBOSS_HOME/standalone/deployments/*.dodeploy

cd $PROJECT_HOME
mvn clean install
ln -s $PROJECT_HOME/target/week2-demo1.war $JBOSS_HOME/standalone/deployments/week2-demo1.war

$JBOSS_HOME/bin/standalone.sh