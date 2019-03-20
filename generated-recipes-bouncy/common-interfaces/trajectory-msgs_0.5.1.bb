# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some robot trajectory message definitions."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    std-msgs \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    builtin-interfaces \
    geometry-msgs \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/trajectory_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "be9f27ea05dbd7ae164578ce315c22ac"
SRC_URI[sha256sum] = "bc7be0ee1c5bd7d00965123b4dc61a7cf75d446e92ed17e4f8a0f1d67c8df9aa"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-trajectory_msgs-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/common-interfaces/common-interfaces_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/common-interfaces/common-interfaces_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-interfaces/common-interfaces-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-interfaces/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-interfaces/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

