# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Several default plugins for rviz to cover the basic functionality."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros2/rviz/blob/ros2/README.md"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = "geometry-msgs laser-geometry map-msgs nav-msgs pluginlib rclcpp resource-retriever rviz-common rviz-rendering tinyxml-vendor urdf visualization-msgs qtbase qtbase qtbase qtbase qtbase"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-cmake-cppcheck-native ament-cmake-cpplint-native ament-cmake-gmock-native ament-cmake-gtest-native ament-cmake-lint-cmake-native ament-cmake-uncrustify-native ament-index-cpp-native rviz-rendering-tests-native rviz-visual-testing-framework-native"

SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_default_plugins/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "be021042fa8ae44bab28859b8e612923"
SRC_URI[sha256sum] = "c556500191b41b4e320a463f22dfdc064bc7603c06a3e694f28fbabc1ed1915e"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_default_plugins-4.0.2-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rviz-default-plugins/rviz-default-plugins-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rviz-default-plugins/rviz-default-plugins-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz-default-plugins/rviz-default-plugins-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz-default-plugins/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz-default-plugins/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

