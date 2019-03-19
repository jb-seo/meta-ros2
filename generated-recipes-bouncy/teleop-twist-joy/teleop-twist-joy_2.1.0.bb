# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generic joystick teleop for twist robots."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "http://wiki.ros.org/teleop_twist_joy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = "geometry-msgs rclcpp sensor-msgs"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/teleop_twist_joy-release/archive/release/bouncy/teleop_twist_joy/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dfba91ed0f9dfa94f85ea279c1cd4409"
SRC_URI[sha256sum] = "d2aa20f24742dd110f441a47da19d30c4ac5d8bcd8e2493790d2fa4c97ffba5f"
S = "${WORKDIR}/teleop_twist_joy-release-release-bouncy-teleop_twist_joy-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/teleop-twist-joy/teleop-twist-joy-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/teleop-twist-joy/teleop-twist-joy-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-twist-joy/teleop-twist-joy-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-twist-joy/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-twist-joy/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

