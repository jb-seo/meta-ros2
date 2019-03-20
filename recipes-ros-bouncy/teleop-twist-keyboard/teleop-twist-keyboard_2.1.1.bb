# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A robot-agnostic teleoperation node to convert keyboard commands to Twist     messages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e0ab6366e5108a0da760802f538e6ed"

DEPENDS = "geometry-msgs rclpy"
SRC_URI = "https://github.com/ros2-gbp/teleop_twist_keyboard-release/archive/release/bouncy/teleop_twist_keyboard/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bf475e8962865b0f6c1648d7a56170ff"
SRC_URI[sha256sum] = "e1beef0bf74e542069670f04427b21f17a48a37106f6e9aff11d69bf816bd88d"
S = "${WORKDIR}/teleop_twist_keyboard-release-release-bouncy-teleop_twist_keyboard-2.1.1-0"


inherit ros
inherit setuptools3

