# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "camera_calibration_parsers contains routines for reading and writing camera calibration parameters."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " rclcpp sensor-msgs yaml-cpp-vendor"
SRC_URI = "https://github.com/ros2-gbp/image_common-release/archive/release/crystal/camera_calibration_parsers/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "17e1759bce5a2726cdf4ccc801dd9eda"
SRC_URI[sha256sum] = "5514c154dde82c64bfeb0429016be98dca06045908ab314727c0ef234615a26a"
S = "${WORKDIR}/image_common-release-release-crystal-camera_calibration_parsers-2.0.1-0"

inherit ament
