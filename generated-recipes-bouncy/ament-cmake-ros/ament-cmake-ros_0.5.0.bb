# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS specific CMake bits in the ament buildsystem."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
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
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

SRC_URI = "https://github.com/ros2-gbp/ament_cmake_ros-release/archive/release/bouncy/ament_cmake_ros/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9a8f007511f615e3dcee2f04ce5515c5"
SRC_URI[sha256sum] = "cc191a3b4c9b489ec62c46ec7f92b499c5138ef7795e7166cb7bdc5cbb47ff18"
S = "${WORKDIR}/ament_cmake_ros-release-release-bouncy-ament_cmake_ros-0.5.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ament-cmake-ros/ament-cmake-ros_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ament-cmake-ros/ament-cmake-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-cmake-ros/ament-cmake-ros-${PV}_common.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

