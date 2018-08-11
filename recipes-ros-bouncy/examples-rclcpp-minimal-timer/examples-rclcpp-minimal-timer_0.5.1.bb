# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal nodes which have timers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rclcpp"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclcpp_minimal_timer/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1d8c0643563a010db9f64d77868d95ca"
SRC_URI[sha256sum] = "6ab34af6c1bbe1a1877befd839020f2b094becb9d46c84ca26a3d4434977e749"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclcpp_minimal_timer-0.5.1-0"

inherit catkin
