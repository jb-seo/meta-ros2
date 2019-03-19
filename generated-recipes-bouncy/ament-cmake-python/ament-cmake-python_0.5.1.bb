# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to use Python in the ament buildsystem in CMake."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_python/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "057894d5dca217b97ddce364bbc46d85"
SRC_URI[sha256sum] = "99df138eb95d0653501e3663867cbae3b83a816bacd9ecd04d30ed6f6e133433"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_python-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ament-cmake-python/ament-cmake-python-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ament-cmake-python/ament-cmake-python-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-cmake-python/ament-cmake-python-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-cmake-python/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-cmake-python/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

