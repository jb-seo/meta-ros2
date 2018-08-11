# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal publishers using rclpy."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclpy_minimal_publisher/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c781cc12c6dbe4880efe6b24eb373f16"
SRC_URI[sha256sum] = "24704bfde8fca3ad6fce935365dbf1789c74aeb4ad04ecda3c6ac9175da46390"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclpy_minimal_publisher-0.5.1-0"

inherit catkin
