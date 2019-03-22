# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ stdlib-compatible wrapper around tlsf allocator and ROS2 examples"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"

ROS_BUILD_DEPENDS = " \
    ament-cmake \
    rclcpp \
    rmw \
    std-msgs \
    tlsf \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support this concept, so build them when we build this package even though they aren't.
ROS_EXPORT_DEPENDS = " \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

RDEPENDS_${PN} += " \
    ament-cmake \
    rclcpp \
    rmw \
    std-msgs \
    tlsf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    rmw-implementation-cmake \
"

SRC_URI = "https://github.com/ros2-gbp/realtime_support-release/archive/release/bouncy/tlsf_cpp/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ab7a7cd3434475bc3dfe0e28f78c6906"
SRC_URI[sha256sum] = "67033ce905229b25e55d140b23115e2450308bdbcb8c1cb04f9d34abb8c900d0"
S = "${WORKDIR}/realtime_support-release-release-bouncy-tlsf_cpp-0.5.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/realtime-support/realtime-support_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/realtime-support/realtime-support_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/realtime-support/realtime-support-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/realtime-support/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/realtime-support/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

