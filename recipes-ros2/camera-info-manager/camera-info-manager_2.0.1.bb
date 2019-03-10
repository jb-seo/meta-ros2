# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a C++ interface for camera calibration      information.  It provides CameraInfo, and handles SetCameraInfo      service requests, saving and restoring the camera calibration      data."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros camera-calibration-parsers image-transport rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/image_common-release/archive/release/crystal/camera_info_manager/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0db22c0d74a092d83576ca229b0a8a92"
SRC_URI[sha256sum] = "65a8f9750504734de8a7033629376d64487c7a0467394f8438b92ff98aee89ef"
S = "${WORKDIR}/image_common-release-release-crystal-camera_info_manager-2.0.1-0"

inherit catkin
