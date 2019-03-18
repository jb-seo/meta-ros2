# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of ROS2 message filters which take in messages and may output those messages at a later time, based on the conditions that filter needs met."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "  builtin-interfaces rclcpp rclpy"
SRC_URI = "https://github.com/ros2-gbp/ros2_message_filters-release/archive/release/crystal/message_filters/3.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ed19c71a6142e737191d8d21b7ef894"
SRC_URI[sha256sum] = "8fe2f16068afc46bdb688496deda0717a80a87a0ec6730f1c6361c9176f63f9e"
S = "${WORKDIR}/ros2_message_filters-release-release-crystal-message_filters-3.0.0-0"

inherit ament
