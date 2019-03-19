# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files for turtlebot2 teleop demo"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = "joy launch ros2run teleop-twist-joy turtlebot2-drivers"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-lint-auto-native ament-lint-common-native"

SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/turtlebot2_teleop/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0477edef35f8405c6286ea6396f7ef8c"
SRC_URI[sha256sum] = "4b9637f72e5feb43457214652f4868d3c1351160cc5ab9e6ca4ee04641665430"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-turtlebot2_teleop-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/turtlebot2-teleop/turtlebot2-teleop-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/turtlebot2-teleop/turtlebot2-teleop-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot2-teleop/turtlebot2-teleop-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot2-teleop/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot2-teleop/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

