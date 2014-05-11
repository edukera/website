#! /bin/sh

GWT_DIR=~/archive/gwt-2.6.0
PROJECT_DIR=~/git/website/Website
CSS_DIR=${PROJECT_DIR}/src/main/resources/com/edukera/website/client/resources/css
BUNDLE_DIR=${PROJECT_DIR}/src/main/java/com/edukera/website/client/resources

generate () {
    LOWER=`echo ${1} | tr '[:upper:]' '[:lower:]'`;
    java -cp ${GWT_DIR}/gwt-dev.jar:${GWT_DIR}/gwt-user.jar \
	com.google.gwt.resources.css.InterfaceGenerator \
	-standalone \
	-typeName com.edukera.website.client.resources.${1}CssResource \
	-css ${CSS_DIR}/${LOWER}.css \
	| sed 's/interface/public interface/g' \
	> ${BUNDLE_DIR}/${1}CssResource.java;

}

generate Style;
