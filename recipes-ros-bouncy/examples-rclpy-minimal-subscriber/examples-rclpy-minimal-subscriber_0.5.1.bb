# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal subscribers using rclpy."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclpy_minimal_subscriber/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "047713181b6b487e7dabc663fd6b0cd0"
SRC_URI[sha256sum] = "3b12a59efbfd51e510004601e10953ac02aff8dc7d3660ae351393bf401824d6"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclpy_minimal_subscriber-0.5.1-0"

inherit catkin
