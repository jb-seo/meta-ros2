# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around libcurl, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://github.com/curl/curl"
SECTION = "devel"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_BUILD_DEPENDS = " \
    curl \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
ROS_EXPORT_DEPENDS = " \
    curl \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    pkgconf-native \
"
DEPENDS += "${ROS_BUILDTOOL_EXPORT_DEPENDS}"

ROS_EXEC_DEPENDS = " \
    curl \
"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/bouncy/libcurl_vendor/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e1c43763c78c1d471f061243137207a2"
SRC_URI[sha256sum] = "42bade1696caa4699aebdf4daaec5b5083e7d344c5bf2633670a0d8315e765fb"
S = "${WORKDIR}/resource_retriever-release-release-bouncy-libcurl_vendor-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/resource-retriever/resource-retriever_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/resource-retriever/resource-retriever_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/resource-retriever-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

