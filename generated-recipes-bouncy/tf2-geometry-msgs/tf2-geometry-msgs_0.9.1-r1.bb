# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_geometry_msgs"
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
HOMEPAGE = "http://www.ros.org/wiki/tf2_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = "geometry-msgs orocos-kdl tf2 tf2-ros"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-auto-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-cmake-gtest-native"

SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/bouncy/tf2_geometry_msgs/0.9.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cdd2ce7dd3a0ab2b9bba5412a259f439"
SRC_URI[sha256sum] = "ee615a16b5f7f185b2f1aaddc5c2f8a010acd22ed43b77856a0b35d448fa0acb"
S = "${WORKDIR}/geometry2-release-release-bouncy-tf2_geometry_msgs-0.9.1-1"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/tf2-geometry-msgs/tf2-geometry-msgs-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/tf2-geometry-msgs/tf2-geometry-msgs-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tf2-geometry-msgs/tf2-geometry-msgs-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tf2-geometry-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tf2-geometry-msgs/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

