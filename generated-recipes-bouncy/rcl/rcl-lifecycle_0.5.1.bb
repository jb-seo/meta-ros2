# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing a C-based lifecycle implementation"
AUTHOR = "Karsten Knese <karsten@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    lifecycle-msgs \
    rcl \
    rcutils \
    rmw-implementation \
    rosidl-default-generators \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    rosidl-default-generators-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    lifecycle-msgs \
    rcl \
    rcutils \
    rmw-implementation \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/bouncy/rcl_lifecycle/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ae6e020bbe2c9ab0ff2205e56d893718"
SRC_URI[sha256sum] = "37eac532ca248e4b0788c7c7af471d450c4115b361650b85ca3e39e9ad4d3084"
S = "${WORKDIR}/rcl-release-release-bouncy-rcl_lifecycle-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rcl/rcl_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rcl/rcl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl/rcl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rcl/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

