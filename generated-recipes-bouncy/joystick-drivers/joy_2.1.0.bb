# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS2 driver for a generic Linux joystick.     Will contain a MacOS and Windows version later.     The joy package contains joy_node, a node that interfaces a     generic Linux joystick to ROS2. This node publishes a &quot;Joy&quot;     message, which contains the current state of each one of the     joystick's buttons and axes."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros2/joystick_drivers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    sensor-msgs \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
ROS_EXPORT_DEPENDS = " \
    rclcpp \
    sensor-msgs \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_EXPORT_DEPENDS}"

ROS_EXEC_DEPENDS = " \
    rclcpp \
    sensor-msgs \
"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

SRC_URI = "https://github.com/ros2-gbp/joystick_drivers-release/archive/release/bouncy/joy/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "45ce53ab8914465f81f3c00ed863df19"
SRC_URI[sha256sum] = "42f44c4a24dc860d3dd44f0ec6ecd818ee0c81f02d3656fc1fae2c0e7d2724d4"
S = "${WORKDIR}/joystick_drivers-release-release-bouncy-joy-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/joystick-drivers/joystick-drivers_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/joystick-drivers/joystick-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/joystick-drivers/joystick-drivers-${PV}_common.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

