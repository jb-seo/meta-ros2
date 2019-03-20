# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "<p>             amcl is a probabilistic localization system for a robot moving in             2D. It implements the adaptive (or KLD-sampling) Monte Carlo             localization approach (as described by Dieter Fox), which uses a             particle filter to track the pose of a robot against a known map.         </p>         <p>             This node is derived, with thanks, from Andrew Howard's excellent             'amcl' Player driver.         </p>"
AUTHOR = "D. Hood <dhood@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/amcl"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=58d727014cda5ed405b7fb52666a1f97"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    rcutils \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
    ament-cmake-ros-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    rcutils \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    map-server \
"

SRC_URI = "https://github.com/ros2-gbp/navigation-release/archive/release/bouncy/amcl/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bc7da83f0ff07046283a8cd18f43295a"
SRC_URI[sha256sum] = "d51f060b28a6f705570ad7c5a97944ee03365274d75d888e4e08b7f3e8959a94"
S = "${WORKDIR}/navigation-release-release-bouncy-amcl-3.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/navigation/navigation_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/navigation/navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

