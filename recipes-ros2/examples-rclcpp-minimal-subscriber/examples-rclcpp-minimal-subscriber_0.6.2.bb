# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal subscribers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rclcpp std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclcpp_minimal_subscriber/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4e3c3537c447a1220d2dcadedb34f623"
SRC_URI[sha256sum] = "29ff114d36360293167d10e388d472d1974f8cfd6e4de7e047c4ca244abf1704"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclcpp_minimal_subscriber-0.6.2-0"

inherit catkin
