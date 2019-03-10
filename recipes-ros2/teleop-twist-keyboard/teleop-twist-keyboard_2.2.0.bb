# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A robot-agnostic teleoperation node to convert keyboard commands to Twist     messages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e0ab6366e5108a0da760802f538e6ed"

DEPENDS = "geometry-msgs rclpy"
SRC_URI = "https://github.com/ros2-gbp/teleop_twist_keyboard-release/archive/release/crystal/teleop_twist_keyboard/2.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4be42040e2081cb858d82d3a0a731313"
SRC_URI[sha256sum] = "2b900f9b7189e874bb2d13b56426e6d1c2c6d632e92e69890b1aa32bd9d04ddb"
S = "${WORKDIR}/teleop_twist_keyboard-release-release-crystal-teleop_twist_keyboard-2.2.0-0"

inherit catkin
