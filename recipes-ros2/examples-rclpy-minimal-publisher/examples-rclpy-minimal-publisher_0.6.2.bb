# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal publishers using rclpy."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclpy_minimal_publisher/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b084133fafadc951ddd2d12e66476b47"
SRC_URI[sha256sum] = "84b3bad66848538a1c8aa42177abf8d3d60956a7e0e1d00ec7ffea1379ef31a0"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclpy_minimal_publisher-0.6.2-0"

inherit ament
