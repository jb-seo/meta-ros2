# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Any tools relating to mathematical geometry.      Primarily featuring polynomials and interpolations."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_geometry"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-containers ecl-exceptions ecl-formatters ecl-license ecl-linear-algebra ecl-math ecl-mpl ecl-type-traits"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-cmake-gtest-native ament-lint-auto-native ament-lint-common-native"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_geometry/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cf7882d28aea9f7ae039cbfe8308b6c6"
SRC_URI[sha256sum] = "396082f466eea7d29c6d9440019c3131b4ff1aabeaa1d2768ff50f77fa0ee9e3"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_geometry-1.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ecl-geometry/ecl-geometry-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ecl-geometry/ecl-geometry-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-geometry/ecl-geometry-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-geometry/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-geometry/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

