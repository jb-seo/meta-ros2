# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generic joystick teleop for twist robots."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " geometry-msgs rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/teleop_twist_joy-release/archive/release/crystal/teleop_twist_joy/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ff1f0b9255873d7439a3277a44af9e4a"
SRC_URI[sha256sum] = "a7d77f7bc4efb63a825c9f06c88703e9373dafe9a615473f6a1a7c4866fea635"
S = "${WORKDIR}/teleop_twist_joy-release-release-crystal-teleop_twist_joy-2.1.1-0"

inherit ament
