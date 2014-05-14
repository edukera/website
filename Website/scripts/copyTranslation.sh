#! /bin/sh

PROJECT_DIR=~/git/data/Data
OUTPUT_PROJECT=~/git/website/Website
OUTPUT_DIR=${OUTPUT_PROJECT}/src/main/resources/com/edukera/website/client/resources

for i in ${PROJECT_DIR}/list.properties/*; do
    j=`basename ${i}`
    cp ${i}/website.properties ${OUTPUT_DIR}/properties/website.${j}.properties
done
