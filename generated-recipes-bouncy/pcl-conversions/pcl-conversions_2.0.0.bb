# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "http://wiki.ros.org/pcl_conversions"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    libeigen \
    pcl \
    sensor-msgs \
    std-msgs \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support this concept, so build them when we build this package even though they aren't.
ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    libeigen \
    pcl \
    sensor-msgs \
    std-msgs \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

RDEPENDS_${PN} += " \
    builtin-interfaces \
    libeigen \
    pcl \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

SRC_URI = "https://github.com/ros2-gbp/pcl_conversions-release/archive/release/bouncy/pcl_conversions/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8331fc6c5f2f04637a4efcc90f262543"
SRC_URI[sha256sum] = "6b75fca01e3d419f039ce4a4e54c870f7274ad59f47c16715676ea067974650a"
S = "${WORKDIR}/pcl_conversions-release-release-bouncy-pcl_conversions-2.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/pcl-conversions/pcl-conversions_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/pcl-conversions/pcl-conversions_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pcl-conversions/pcl-conversions-${PV}_common.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

