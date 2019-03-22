# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization     and mapping (SLAM) in 2D and 3D across multiple platforms and sensor     configurations."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "https://github.com/googlecartographer/cartographer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

ROS_BUILD_DEPENDS = " \
    boost \
    libeigen \
    g++-static \
    cairo \
    ceres-solver \
    gflags \
    libgoogle-glog-dev \
    lua \
    protobuf \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support this concept, so build them when we build this package even though they aren't.
ROS_EXPORT_DEPENDS = " \
    boost \
    libeigen \
    cairo \
    ceres-solver \
    gflags \
    libgoogle-glog-dev \
    lua \
    protobuf \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

RDEPENDS_${PN} += " \
    boost \
    libeigen \
    cairo \
    ceres-solver \
    gflags \
    libgoogle-glog-dev \
    lua \
    protobuf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
"

SRC_URI = "https://github.com/ros2-gbp/cartographer-release/archive/release/bouncy/cartographer/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d8fa858f1a1cd6009d51e8b0565eb4e2"
SRC_URI[sha256sum] = "51d1a1d834147212a900c4ed2ea2333e4a318278d74776939aa0b7de1edf370c"
S = "${WORKDIR}/cartographer-release-release-bouncy-cartographer-2.1.0-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/cartographer/cartographer_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/cartographer/cartographer_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer/cartographer-${PV}_common.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

