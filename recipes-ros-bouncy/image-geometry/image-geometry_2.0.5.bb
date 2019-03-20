# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "`image_geometry` contains C++ and Python libraries for interpreting images     geometrically. It interfaces the calibration parameters in sensor_msgs/CameraInfo     messages with OpenCV functions such as image rectification, much as cv_bridge     interfaces ROS sensor_msgs/Image with OpenCV data types."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs libopencv-dev"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/bouncy/image_geometry/2.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "29530e128ff061dbab776bc4fcd68cf7"
SRC_URI[sha256sum] = "23fadf7255a7c69a9e6165d87404c1547439688b0efa18480dcdd1e1aeac707a"
S = "${WORKDIR}/vision_opencv-release-release-bouncy-image_geometry-2.0.5-0"


inherit ros
inherit ament

