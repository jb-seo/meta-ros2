# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package provides GoogleMock."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = "gtest-vendor cmake"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/googletest-release/archive/release/bouncy/gmock_vendor/1.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4d957ff33cc3fcefe159797e16891b16"
SRC_URI[sha256sum] = "aaaffd0ea6c9203192d8f37daa0316e2c7cd3b3e4146270afc51a7c9c464595d"
S = "${WORKDIR}/googletest-release-release-bouncy-gmock_vendor-1.8.0-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/gmock-vendor/gmock-vendor-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/gmock-vendor/gmock-vendor-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gmock-vendor/gmock-vendor-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gmock-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gmock-vendor/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

