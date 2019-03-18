# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal service servers using rclpy."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "example-interfaces rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclpy_minimal_service/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0aacbe0f57c96386977b392bd11843fe"
SRC_URI[sha256sum] = "7ac6e6f89999a76c18f9229a75f5a441784fec08ff55034d8bba5c03bd4ad306"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclpy_minimal_service-0.6.2-0"

inherit ament
