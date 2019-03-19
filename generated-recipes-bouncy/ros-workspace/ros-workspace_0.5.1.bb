# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides the prefix level environment files for ROS 2 packages."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = "ament-cmake-core ament-package"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "cmake-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/ros_workspace-release/archive/release/bouncy/ros_workspace/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bd8bc263aa7558b4610dfb69ee41c035"
SRC_URI[sha256sum] = "2417d917dd856d122f0b332ecca368c2e2a7eb9d06626c073383a55b5e1fa403"
S = "${WORKDIR}/ros_workspace-release-release-bouncy-ros_workspace-0.5.1-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ros-workspace/ros-workspace-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ros-workspace/ros-workspace-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-workspace/ros-workspace-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-workspace/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-workspace/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

