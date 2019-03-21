# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS2 driver for a generic Linux joystick.     Will contain a MacOS and Windows version later.     The joy package contains joy_node, a node that interfaces a     generic Linux joystick to ROS2. This node publishes a &quot;Joy&quot;     message, which contains the current state of each one of the     joystick's buttons and axes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/${PN}stick_drivers-release/archive/release/bouncy/${PN}/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "45ce53ab8914465f81f3c00ed863df19"
SRC_URI[sha256sum] = "42f44c4a24dc860d3dd44f0ec6ecd818ee0c81f02d3656fc1fae2c0e7d2724d4"
S = "${WORKDIR}/${PN}stick_drivers-release-release-bouncy-${PN}-2.1.0-0"

inherit ros
inherit ament


