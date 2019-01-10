docker exec -it git1_glassfish2_1  bash

rm /usr/local/glassfish4/glassfish/domains/domain1/autodeploy/.autodeploystatus/test6*
cd /usr/local/glassfish4/glassfish/domains/domain1/autodeploy/
mv test6-1.0-SNAPSHOT.war /tmp/
mv /tmp/test6-1.0-SNAPSHOT.war .
