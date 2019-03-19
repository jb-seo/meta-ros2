# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake shim over the tinxml library."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = "libtinyxml"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "cmake-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/tinyxml_vendor-release/archive/release/bouncy/tinyxml_vendor/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7b0a4b3c128d0d1df1a83dec3f41e09b"
SRC_URI[sha256sum] = "3e061cc6b5630c477e5675633654ad70fb41076d5fb5bfa417f79975688a0372"
S = "${WORKDIR}/tinyxml_vendor-release-release-bouncy-tinyxml_vendor-0.5.0-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/tinyxml-vendor/tinyxml-vendor-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/tinyxml-vendor/tinyxml-vendor-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tinyxml-vendor/tinyxml-vendor-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tinyxml-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tinyxml-vendor/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

