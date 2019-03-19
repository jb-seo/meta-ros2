# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "map_server provides the <tt>map_server</tt> ROS <a href="http://www.ros.org/wiki/Nodes">Node</a>, which offers map data as a ROS <a href="http://www.ros.org/wiki/Services">Service</a>. It also provides the <tt>map_saver</tt> command-line utility, which allows dynamically generated maps to be saved to file."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/map_server"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BUILD_DEPENDS = "geometry-msgs nav-msgs rclcpp rcutils tf2 libsdl libsdl-image yaml-cpp"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-cmake-gtest-native ament-cmake-pytest-native launch-testing-native rclpy-native"

SRC_URI = "https://github.com/ros2-gbp/navigation-release/archive/release/bouncy/map_server/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "adb17c5bca1ea29d6c73784b5c7b946e"
SRC_URI[sha256sum] = "e88e2e3ca3bc362bb239a9676c6eb163f4bacde842ebdee79ee3cdb850dd8ac9"
S = "${WORKDIR}/navigation-release-release-bouncy-map_server-3.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/map-server/map-server-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/map-server/map-server-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/map-server/map-server-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/map-server/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/map-server/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

