# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS2 driver for a generic Linux joystick.     Will contain a MacOS and Windows version later.     The joy package contains joy_node, a node that interfaces a     generic Linux joystick to ROS2. This node publishes a &quot;Joy&quot;     message, which contains the current state of each one of the     joystick's buttons and axes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/${PN}stick_drivers-release/archive/release/crystal/${PN}/2.2.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e7add23053fc83133adbe0b224bbb9fe"
SRC_URI[sha256sum] = "152ffbbf68d99fbc22428f22cd4a7cbe031e3927cd606f09c3cd1001428dc0e4"
S = "${WORKDIR}/${PN}stick_drivers-release-release-crystal-${PN}-2.2.0-1"

inherit ament
