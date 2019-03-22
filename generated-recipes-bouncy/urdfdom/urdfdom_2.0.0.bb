# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A library to access URDFs using the DOM model."
AUTHOR = "Steven! Ragnarök <steven@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    libtinyxml \
    tinyxml-vendor \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
ROS_EXPORT_DEPENDS = ""
DEPENDS += "${ROS_EXPORT_DEPENDS}"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_EXPORT_DEPENDS}"

ROS_EXEC_DEPENDS = " \
    libtinyxml \
    tinyxml-vendor \
"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/urdfdom-release/archive/release/bouncy/urdfdom/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d273cff11de4cafbb898f3024290181b"
SRC_URI[sha256sum] = "b13ced6b5353353ed0a52744b6f917e303021c65a50726e3c83a62f0091f18fd"
S = "${WORKDIR}/urdfdom-release-release-bouncy-urdfdom-2.0.0-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/urdfdom/urdfdom_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/urdfdom/urdfdom_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urdfdom/urdfdom-${PV}_common.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}
