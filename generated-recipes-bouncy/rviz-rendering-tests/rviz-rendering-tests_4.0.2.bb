# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Example plugin for RViz - documents and tests RViz plugin development"
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros2/rviz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BUILD_DEPENDS = "resource-retriever rviz-rendering qtbase"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-cmake-cppcheck-native ament-cmake-cpplint-native ament-cmake-gmock-native ament-cmake-gtest-native ament-cmake-lint-cmake-native ament-cmake-uncrustify-native ament-index-cpp-native"

SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_rendering_tests/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ee4c1cfa3a56c965a3290dffa4c103b4"
SRC_URI[sha256sum] = "7eaa51dc42eaecb74db32950c02dc9b01732a5ed62a9b31fefcc3cbc7abbfe7b"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_rendering_tests-4.0.2-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rviz-rendering-tests/rviz-rendering-tests-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rviz-rendering-tests/rviz-rendering-tests-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz-rendering-tests/rviz-rendering-tests-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz-rendering-tests/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz-rendering-tests/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

