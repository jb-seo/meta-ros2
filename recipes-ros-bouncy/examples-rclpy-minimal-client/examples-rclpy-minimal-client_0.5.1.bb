# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal service clients using rclpy."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "example-interfaces rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclpy_minimal_client/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e6da45d9266691ae773d70f40923d72b"
SRC_URI[sha256sum] = "263fed9a943e3baa53e5292eb9abcaa6f28add38c74c9bef58b50a8ba9f4b3df"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclpy_minimal_client-0.5.1-0"


inherit ros
inherit setuptools3

