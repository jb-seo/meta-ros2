# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal publisher nodes"
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    std-msgs \
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
    rclcpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
"

SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclcpp_minimal_publisher/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a350b9037e483bc94c47cb261ca831aa"
SRC_URI[sha256sum] = "18b3dd04fd992e018e67643216a178d5570b02efec95f3cd69ed5b1c47a0db9c"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclcpp_minimal_publisher-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/examples/examples_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/examples/examples_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/examples-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

