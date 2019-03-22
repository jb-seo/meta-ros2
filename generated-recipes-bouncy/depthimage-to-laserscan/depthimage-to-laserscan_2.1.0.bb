# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "depthimage_to_laserscan"
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/depthimage_to_laserscan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    image-geometry \
    opencv \
    rclcpp \
    sensor-msgs \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support this concept, so build them when we build this package even though they aren't.
ROS_EXPORT_DEPENDS = " \
    image-geometry \
    opencv \
    rclcpp \
    sensor-msgs \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

RDEPENDS_${PN} += " \
    image-geometry \
    opencv \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

SRC_URI = "https://github.com/ros2-gbp/depthimage_to_laserscan-release/archive/release/bouncy/depthimage_to_laserscan/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "404fab2cbe73411fc38e2d05b11bf413"
SRC_URI[sha256sum] = "909bf014f689eed98f1e790afa350f4f87ca2eecc1bc52763b24bac8374ef395"
S = "${WORKDIR}/depthimage_to_laserscan-release-release-bouncy-depthimage_to_laserscan-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/depthimage-to-laserscan/depthimage-to-laserscan_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/depthimage-to-laserscan/depthimage-to-laserscan_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/depthimage-to-laserscan-${PV}_common.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

