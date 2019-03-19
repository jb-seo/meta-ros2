# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-independent package for logging that seamlessly pipes into rosconsole/rosout for ROS-dependent packages."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "cmake-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/console_bridge-release/archive/release/bouncy/console_bridge/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "508bb295be696e857fa59fad33054257"
SRC_URI[sha256sum] = "171f0c10897a1de2d0ab0e797d3fdc92f9acdb846b3fa79867529a7006a60f49"
S = "${WORKDIR}/console_bridge-release-release-bouncy-console_bridge-0.4.0-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/console-bridge/console-bridge-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/console-bridge/console-bridge-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/console-bridge/console-bridge-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/console-bridge/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/console-bridge/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

