# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The launch command for ROS 2 command line tools."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = "ament-index-python launch launch-ros ros2cli ros2pkg"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-copyright-native ament-flake8-native ament-pep257-native python3-pytest-native"

SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/bouncy/${PN}/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5d330f978273a3a38e811cec36ac11a7"
SRC_URI[sha256sum] = "7aad303b42a0d5c2208743193e80f1500bddc5e79eaaf7e18c0063a030c0d90b"
S = "${WORKDIR}/launch-release-release-bouncy-${PN}-0.6.0-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ros2launch/ros2launch-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ros2launch/ros2launch-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros2launch/ros2launch-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros2launch/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros2launch/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

