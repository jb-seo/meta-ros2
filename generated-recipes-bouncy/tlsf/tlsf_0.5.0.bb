# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TLSF allocator version 2.4.6"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"

ROS_BUILD_DEPENDS = "ament-cmake"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2cfee668d0800cf38958bd5db390b122"
SRC_URI[sha256sum] = "5890f4cebf87cb7235174541786c815c0438e3400cb382e2e41b3992bf3830ad"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/tlsf/tlsf-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/tlsf/tlsf-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tlsf/tlsf-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tlsf/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tlsf/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

